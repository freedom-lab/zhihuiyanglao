

import request from '@/utils/request'


export function getData (data) {
  //获取列表数据
  return request({
    url: '/insLogisticsGoodsInfo/list',
    method: 'post',
    data
  })
}

export function save (data) {
  //保存
  return request({
    url: '/insLogisticsGoodsInfo/save',
    method: 'post',
    data
  })
}


export function del(data) {
  //删除
  return request({
    url: '/insLogisticsGoodsInfo/delete',
    method: 'post',
    data
  })
}

export function queryOne (data) {
  //获取单个数据
  return request({
    url: '/insLogisticsGoodsInfo/queryOne',
    method: 'post',
    data
  })
}

