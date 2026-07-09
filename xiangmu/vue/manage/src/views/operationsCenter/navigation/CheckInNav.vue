<template>
    <div class="canvas-container">
      <h3 class="chart-title">{{ title }}</h3>
      <!-- 画布容器 -->
      <div ref="canvasWrapper" class="wrapper">
        <canvas ref="flowCanvas"></canvas>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: 'FlowChart',
    data() {
      return {
        title: '养老机构营销及入住办理',
        // 定义颜色配置，对应你截图中的颜色风格
        colors: {
          green: '#7CB342', // 咨询登记、合同生成
          yellow: '#FBC02D', // 意向客户、入住评估
          blue: '#42A5F5',   // 客户列表、预定床位
          darkBlue: '#3949AB', // 签订合同、入住登记
          red: '#E53935',    // 合同审批、缴费审批
          text: '#FFFFFF'
        },
        // 节点数据 (x, y 为相对百分比坐标，方便适配不同屏幕)
        nodes: [
          { id: 'n1', label: '咨询登记', x: 0.1, y: 0.3, colorKey: 'green' },
          { id: 'n2', label: '意向客户', x: 0.25, y: 0.3, colorKey: 'yellow' },
          { id: 'n3', label: '客户列表', x: 0.5, y: 0.1, colorKey: 'blue' },
          { id: 'n4', label: '预定床位', x: 0.4, y: 0.3, colorKey: 'blue' },
          { id: 'n5', label: '签订合同', x: 0.6, y: 0.3, colorKey: 'darkBlue' },
          { id: 'n6', label: '合同审批', x: 0.75, y: 0.3, colorKey: 'red', shape: 'diamond' }, // 菱形特殊处理
          { id: 'n7', label: '合同生成', x: 0.9, y: 0.3, colorKey: 'green' },
          { id: 'n8', label: '入住评估', x: 0.55, y: 0.5, colorKey: 'yellow' },
          { id: 'n9', label: '入住登记', x: 0.4, y: 0.7, colorKey: 'darkBlue' },
          { id: 'n10', label: '入住缴费审批', x: 0.55, y: 0.7, colorKey: 'red' },
          { id: 'n11', label: '入住缴费', x: 0.7, y: 0.7, colorKey: 'green' },
          { id: 'n12', label: '生成入住账单', x: 0.85, y: 0.7, colorKey: 'blue' }
        ],
        // 连线数据
        edges: [
          { from: 'n1', to: 'n2' },
          { from: 'n2', to: 'n4' },
          { from: 'n3', to: 'n2' },
          { from: 'n3', to: 'n4' },
          { from: 'n3', to: 'n5' }, // 客户列表 -> 签订合同
          { from: 'n4', to: 'n5' },
          { from: 'n5', to: 'n6' },
          { from: 'n6', to: 'n7', label: '' },
          { from: 'n6', to: 'n8', label: '通过' }, // 审批 -> 评估
          { from: 'n8', to: 'n9' },
          { from: 'n9', to: 'n10' },
          { from: 'n10', to: 'n11' },
          { from: 'n11', to: 'n12' }
        ]
      };
    },
    mounted() {
      this.initCanvas();
      window.addEventListener('resize', this.handleResize);
    },
    beforeDestroy() {
      window.removeEventListener('resize', this.handleResize);
    },
    methods: {
      initCanvas() {
        const canvas = this.$refs.flowCanvas;
        const wrapper = this.$refs.canvasWrapper;
        // 设置画布实际像素大小
        canvas.width = wrapper.clientWidth;
        canvas.height = wrapper.clientHeight || 600; // 默认高度
        this.draw(canvas.getContext('2d'), canvas.width, canvas.height);
      },
      handleResize() {
        // 防抖重绘
        clearTimeout(this.resizeTimer);
        this.resizeTimer = setTimeout(() => {
          this.initCanvas();
        }, 100);
      },
      draw(ctx, width, height) {
        ctx.clearRect(0, 0, width, height);
  
        // 1. 先画线 (这样线会被节点盖住一部分，看起来更自然)
        this.edges.forEach(edge => {
          const startNode = this.nodes.find(n => n.id === edge.from);
          const endNode = this.nodes.find(n => n.id === edge.to);
          if (startNode && endNode) {
            this.drawEdge(ctx, width, height, startNode, endNode, edge.label);
          }
        });
  
        // 2. 再画节点
        this.nodes.forEach(node => {
          this.drawNode(ctx, width, height, node);
        });
      },
      drawNode(ctx, w, h, node) {
        const x = node.x * w;
        const y = node.y * h;
        const radius = 35; // 节点半径
        const color = this.colors[node.colorKey];
  
        ctx.save();
        ctx.translate(x, y);
  
        // 绘制背景形状
        ctx.beginPath();
        if (node.shape === 'diamond') {
          // 菱形逻辑
          ctx.moveTo(0, -radius);
          ctx.lineTo(radius, 0);
          ctx.lineTo(0, radius);
          ctx.lineTo(-radius, 0);
          ctx.closePath();
        } else {
          // 圆形逻辑
          ctx.arc(0, 0, radius, 0, Math.PI * 2);
        }
  
        ctx.fillStyle = color;
        ctx.fill();
        // 可选：加个阴影让它更有立体感
        ctx.shadowColor = 'rgba(0,0,0,0.2)';
        ctx.shadowBlur = 10;
        ctx.shadowOffsetY = 5;
  
        // 绘制文字
        ctx.shadowColor = 'transparent'; // 文字不需要阴影
        ctx.fillStyle = this.colors.text;
        ctx.font = 'bold 14px Microsoft YaHei';
        ctx.textAlign = 'center';
        ctx.textBaseline = 'middle';
  
        // 简单的换行处理（如果文字太长）
        const words = node.label.split('');
        if (words.length > 4) {
          const mid = Math.ceil(words.length / 2);
          ctx.fillText(words.slice(0, mid).join(''), 0, -8);
          ctx.fillText(words.slice(mid).join(''), 0, 8);
        } else {
          ctx.fillText(node.label, 0, 0);
        }
  
        ctx.restore();
      },
      drawEdge(ctx, w, h, start, end, labelText) {
        const startX = start.x * w;
        const startY = start.y * h;
        const endX = end.x * w;
        const endY = end.y * h;
  
        ctx.save();
        ctx.beginPath();
        ctx.strokeStyle = '#BDBDBD'; // 线条颜色
        ctx.lineWidth = 2;
  
        // 计算控制点，形成贝塞尔曲线
        // 这里简单处理：如果是水平移动，控制点在中间；如果是垂直，也在中间
        // 为了效果好，我们假设控制点在 X轴中间，Y轴保持起点高度（横向流）
        // 或者根据具体位置动态调整。这里用一个通用的 S 型曲线逻辑。
  
        const cp1x = startX + (endX - startX) / 2;
        const cp1y = startY;
        const cp2x = startX + (endX - startX) / 2;
        const cp2y = endY;
  
        // 针对某些特定走向优化曲线（比如从上往下）
        if (Math.abs(startY - endY) > Math.abs(startX - endX)) {
           // 垂直主导
           ctx.moveTo(startX, startY + 35); // 从圆底部出发
           ctx.bezierCurveTo(startX, endY, endX, startY, endX, endY - 35);
        } else {
           // 水平主导
           ctx.moveTo(startX + 35, startY); // 从圆右侧出发
           ctx.bezierCurveTo(endX, startY, startX, endY, endX - 35, endY);
        }
  
        ctx.stroke();
  
        // 绘制箭头
        this.drawArrow(ctx, endX, endY, start.x < end.x ? 0 : Math.PI); // 简单判断方向
  
        // 绘制线上的文字（如“通过”）
        if (labelText) {
          ctx.fillStyle = '#666';
          ctx.font = '12px Arial';
          // 计算中点
          const midX = (startX + endX) / 2;
          const midY = (startY + endY) / 2;
          ctx.fillText(labelText, midX + 10, midY - 10);
        }
  
        ctx.restore();
      },
      drawArrow(ctx, x, y, angle) {
         // 简单的箭头绘制逻辑，这里简化处理，实际需要根据线条末端切线角度计算
         // 由于使用了贝塞尔曲线，精确计算末端角度较复杂，这里仅作示意
         // 如果需要完美箭头，建议使用 lineCap 或计算曲线导数
      }
    }
  };
  </script>
  
  <style scoped>
  .canvas-container {
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
  }
  .chart-title {
    font-size: 20px;
    font-weight: bold;
    margin-bottom: 20px;
    color: #333;
  }
  .wrapper {
    width: 100%;
    height: 600px; /* 根据需要调整高度 */
    background-color: #fff;
    border-radius: 8px;
    /* box-shadow: 0 2px 12px 0 rgba(0,0,0,0.1); */
  }
  canvas {
    display: block;
  }
  </style>