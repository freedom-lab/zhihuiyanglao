

import request from '@/utils/request'


export function getData (data) {
  //获取列表数据
  return request({
    url: '/organ/list',
    method: 'post',
    data
  })
}

export function save (data) {
  //保存
  return request({
    url: '/organ/save',
    method: 'post',
    data
  })
}


export function del(data) {
  //删除
  return request({
    url: '/organ/delete',
    method: 'post',
    data
  })
}

export function queryOne (data) {
  //获取单个数据
  return request({
    url: '/organ/queryOne',
    method: 'post',
    data
  })
}

