import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/member/Login'
import Join from '@/components/member/Join'
import List from '@/components/board/List'
import Remove from '@/components/board/Remove'
import Search from '@/components/board/Search'
import Update from '@/components/board/Update'
import Write from '@/components/board/Write'
import Mypage from '@/components/member/Mypage'
import MypageUpdate from '@/components/member/MypageUpdate'

Vue.use(Router)

export default new Router({
	mode: 'history',
	routes: [
		{path: '/login', name: 'login', component: Login},
		{path: '/join', name: 'join', component: Join},
		{path: '/list', name: 'list', component: List},
		{path: '/remove', name: 'remove', component: Remove},
		{path: '/search', name: 'search', component: Search},
		{path: '/update', name: 'update', component: Update},
		{path: '/write', name: 'write', component: Write},
		{path: '/mypage', name: 'mypage', component: Mypage},
		{path: '/mypageUpdate', name: 'mypageUpdate', component: MypageUpdate}
	]
})