

import request from '@/utils/request'


export function getData (data) {
  //获取列表数据
  return request({
    url: '/healthCardiovascular/list',
    method: 'post',
    data
  })
}

export function save (data) {
  //保存
  return request({
    url: '/healthCardiovascular/save',
    method: 'post',
    data
  })
}


export function del(data) {
  //删除
  return request({
    url: '/healthCardiovascular/delete',
    method: 'post',
    data
  })
}

export function queryOne (data) {
  //获取单个数据
  return request({
    url: '/healthCardiovascular/queryOne',
    method: 'post',
    data
  })
}

