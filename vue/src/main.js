import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import vuex from 'vuex' //이건 vue안에서 이걸 쓸 수 있게 한 것 (컨텍스트 느낌)
import es6promise from 'es6-promise/auto'
import {store} from './store'

Vue.config.productionTip = false
Vue.prototype.$http = axios

new Vue({
  render: h => h(App),
  router,
  axios,
  vuex,
  es6promise,
  store
}).$mount('#app')