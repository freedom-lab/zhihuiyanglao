

import request from '@/utils/request'


export function getData (data) {
  //获取列表数据
  return request({
    url: '/smartAlarmLevelSet/list',
    method: 'post',
    data
  })
}

export function save (data) {
  //保存
  return request({
    url: '/smartAlarmLevelSet/save',
    method: 'post',
    data
  })
}


export function del(data) {
  //删除
  return request({
    url: '/smartAlarmLevelSet/delete',
    method: 'post',
    data
  })
}

export function queryOne (data) {
  //获取单个数据
  return request({
    url: '/smartAlarmLevelSet/queryOne',
    method: 'post',
    data
  })
}

