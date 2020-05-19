
const state ={
    userid : '',
    passwd :''
}
const action ={
    login({commit}){
        commit('login')
    },
    join({commit}){
        commit('join')
    }

}
const mutation ={

}
const getter ={

}
export default {
    name:'player',
    namespace : true,
    state,
    action,
    mutation,
    getter
}