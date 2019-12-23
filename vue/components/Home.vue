<template>
<div id="app">
	<layout>
		<template #header="header">
			<h1>{{header.title}}</h1>
			<ul class="menu"> <!-- class로 주는 이유는 아래에 ul.menu 부분에서 menu앞에 점으로 되어있으니까! -->
				<button v-for="i of headers" :key="i.menu" style="float:right">
					<router-link :to="i.link">{{i.menu}}</router-link>
				</button>
			</ul>
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
export default {
	components: {
		Layout
	},
	data(){
		return{
			sidebars: [
				{menu: "글쓰기", link: "/write"},
				{menu: "목록", link: "/list"},
				{menu: "글 수정", link: "/update"},
				{menu: "글 삭제", link: "/remove"},
				{menu: "검색", link: "/search"}
			],
			headers: [
				{menu: "로그인", link: "/login"},
				{menu: "회원가입", link: "/join"}
			]
		}
	}
}
</script>
<style scoped>
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