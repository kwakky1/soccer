import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify'
import router from './router/'
import {store} from './store'
import vuex from 'vuex'
import axios from 'axios'
Vue.config.productionTip = false
Vue.prototype.$http = axios  //객체 기반 프로그램 , Vue 에 shallow 카피가 된 것
Vue.use(vuex)
new Vue({
  vuetify,
  router,
  vuex,
  store,
  axios,
  render: h => h(App)
}).$mount('#app')


