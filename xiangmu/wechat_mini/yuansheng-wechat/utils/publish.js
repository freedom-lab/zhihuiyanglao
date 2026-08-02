const payAttention = () => {
	uni.requestSubscribeMessage({
		tmplIds: ["GjfGpU_Tjztb1Gy1bd4bAFnlM7XQyhGcBgKvGgFr2h4"],
		success(res) {
			console.log(res);
		},
		fail(error) {
			console.log(error);
		}
	})
}

export default payAttention