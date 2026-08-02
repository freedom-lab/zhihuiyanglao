
<#list tableBeanList as tableBean>
    const ${tableBean.beanName} = () => import('../views/${tableBean.beanNameSmall}/${tableBean.beanName}.vue')
    const ${tableBean.beanName}Details = () => import('../views/${tableBean.beanNameSmall}/${tableBean.beanName}Details.vue')
</#list>

<#list tableBeanList as tableBean>
    { path: '/${tableBean.beanNameSmall}', component: ${tableBean.beanName} },
    { path:'/${tableBean.beanNameSmall}/details',component:${tableBean.beanName}Details },
</#list>




