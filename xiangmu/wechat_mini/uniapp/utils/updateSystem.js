export default () => {
	// #ifdef MP
	if (!uni.canIUse('getUpdateManager')) {
		return;
	}

	const updateManager = uni.getUpdateManager();

	updateManager.onCheckForUpdate(function(res) {
		// 请求完新版本信息的回调
		console.log('版本信息', res);
	});

	updateManager.onUpdateReady(function() {
		uni.showModal({
			title: '更新提示',
			content: '新版本已经准备好，是否重启应用？',
			success(res) {
				if (res.confirm) {
					// 新的版本已经下载好，调用 applyUpdate 应用新版本并重启
					updateManager.applyUpdate();
				}
			},
		});
	});

	updateManager.onUpdateFailed(function() {
		// 新版本下载失败
	});
	// #endif
	// #ifdef APP
	// #ifdef APP-PLUS  
	plus.runtime.getProperty(plus.runtime.appid, function(widgetInfo) {
		uni.request({
			url: 'http://www.example.com/update/',
			data: {
				version: widgetInfo.version,
				name: widgetInfo.name
			},
			success: (result) => {
				var data = result.data;
				if (data.update && data.wgtUrl) {
					uni.downloadFile({
						url: data.wgtUrl,
						success: (downloadResult) => {
							if (downloadResult.statusCode === 200) {
								plus.runtime.install(downloadResult.tempFilePath, {
									force: false
								}, function() {
									console.log('install success...');
									plus.runtime.restart();
								}, function(e) {
									console.error('install fail...');
								});
							}
						}
					});
				}
			}
		});
	});
	// #endif
	// #endif

};