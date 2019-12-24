<template>
<div id="app">
	<layout>
		<template #header="header">
			<h1>{{header.title}}</h1>
			<component :is="!loginCheck ? 'pre-auth' : 'post-auth'"></component>
		</template>
		<template #sidebar="sidebar">
			<ul class="menu"> <!-- class로 주는 이유는 아래에 ul.menu 부분에서 menu앞에 점으로 되어있으니까! -->
				<li v-for="i of sidebars" :key="i.menu">
					<router-link :to="i.link">{{i.menu}}</router-link>
				</li>
			</ul>
		</template>
		<template #content="content">
			<!-- <h1>{{content.title}}</h1> -->
		</template>
		<template #footer="footer">
			<h1>{{footer.title}}</h1>
		</template>
	</layout>
</div>
</template>
<script>
import Layout from "@/components/cmm/Layout.vue"
import PreAuth from "@/components/cmm/PreAuth.vue"
import PostAuth from "@/components/cmm/PostAuth.vue"
import {store} from "@/store"
export default {
	components: {
		Layout, PreAuth, PostAuth
	},
	data(){
		return{
			sidebars: [
				{menu: "글쓰기", link: "/write"},
				{menu: "목록", link: "/list"},
				{menu: "글 수정", link: "/update"},
				{menu: "글 삭제", link: "/remove"},
				{menu: "검색", link: "/search"}
			]
		}
	},
	computed:{
		loginCheck: function(){
			return store.state.authCheck
		}
	}
}
</script>
<style scoped>
#button{
	float: right;
}
ul.menu {
    position:relative;
    padding: 5px 5px 5px 5px;
    list-style: none;
    font-style: italic;
}
ul.menu a {
    text-decoration:none;
}
</style>