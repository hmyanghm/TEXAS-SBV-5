<template>
	<div id="auto=box">
		<router-link to="/login" style="float: right">회원탈퇴
		</router-link>
		<router-link to="/login" style="float: right">로그아웃
		</router-link>
	</div>
</template>
<script>
import {store} from "../../store"
import axios from 'axios'
export default {
	data(){

	},
	methods : {
		logout(){
			alert(`로그아웃`)
			store.state.loginedUid = ''
			store.state.loginedPwd = ''
			store.state.name = ''
			store.state.birthday = ''
			store.state.id = ''
			this.$router.push({path: '/login'})
			},
		withdrawal(){
			axios
			.delete(`${this.context}/withdrawal/${store.state.loginedUid}`)
			.then(
				alert(`회원탈퇴`)
			)
			.catch(()=>{
				alert(`회원탈퇴 실패`)
			})
		this.$router.push({path: '/login'})
		}
	}
}
</script>