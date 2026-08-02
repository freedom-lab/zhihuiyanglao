const upLoadFile = (url) => {
	return new Promise((resolve, reject) => {
		// 显示 loading
		uni.showLoading({
			title: '上传中...', // loading 的提示文本
			mask: true, // 遮罩层
		});
		console.log('upLoadFile')
		uni.uploadFile({
			filePath: url,
			name: 'file',
			url: 'https://api.ccnet.cc/api/upload/uploadFile',
			success: (res) => {
				// 上传成功，隐藏 loading
				uni.hideLoading();

				try {
					const data = JSON.parse(res.data);
					if (data && data.data && data.data.url) {
						const fileData = data.data; // 获取上传后的 URL
						resolve(fileData); // 成功时返回文件的 URL
					} else {
						reject("文件上传失败");
					}
				} catch (error) {
					reject(new Error('Failed to parse response'));
				}
			},
			fail: (err) => {
				// 上传失败，隐藏 loading
				uni.hideLoading();

				reject(new Error('Upload failed: ' + err.errMsg)); // 上传失败时返回错误
			}
		});
	});
}

export default upLoadFile