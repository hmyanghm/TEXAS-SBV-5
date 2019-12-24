import Vue from 'vue'
import Vuex from 'vuex' //생성자 함수만 앞 글자가 대문자임
//import axios from 'axios'

Vue.use(Vuex) 

export const store = new Vuex.Store({ //vue 안에 있는 store를 등록한 것
  state: {
		person: {},
		authCheck: false
  }
})