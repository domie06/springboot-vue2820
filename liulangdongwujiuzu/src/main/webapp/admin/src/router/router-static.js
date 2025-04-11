import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import juanzheng from '@/views/modules/juanzheng/list'
    import lingyang from '@/views/modules/lingyang/list'
    import lingyangfankui from '@/views/modules/lingyangfankui/list'
    import lingyangfankuiLiuyan from '@/views/modules/lingyangfankuiLiuyan/list'
    import liulangdongwu from '@/views/modules/liulangdongwu/list'
    import liulangdongwuLiuyan from '@/views/modules/liulangdongwuLiuyan/list'
    import news from '@/views/modules/news/list'
    import qiuzhu from '@/views/modules/qiuzhu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yuangong from '@/views/modules/yuangong/list'
    import config from '@/views/modules/config/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryJuanzheng from '@/views/modules/dictionaryJuanzheng/list'
    import dictionaryLingyangStatus from '@/views/modules/dictionaryLingyangStatus/list'
    import dictionaryLingyangYesno from '@/views/modules/dictionaryLingyangYesno/list'
    import dictionaryLiulangdongwu from '@/views/modules/dictionaryLiulangdongwu/list'
    import dictionaryLiulangdongwuSex from '@/views/modules/dictionaryLiulangdongwuSex/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryJuanzheng',
        name: '捐赠渠道',
        component: dictionaryJuanzheng
    }
    ,{
        path: '/dictionaryLingyangStatus',
        name: '领养状态',
        component: dictionaryLingyangStatus
    }
    ,{
        path: '/dictionaryLingyangYesno',
        name: '审核状态',
        component: dictionaryLingyangYesno
    }
    ,{
        path: '/dictionaryLiulangdongwu',
        name: '动物品种',
        component: dictionaryLiulangdongwu
    }
    ,{
        path: '/dictionaryLiulangdongwuSex',
        name: '动物性别',
        component: dictionaryLiulangdongwuSex
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/juanzheng',
        name: '捐赠信息',
        component: juanzheng
      }
    ,{
        path: '/lingyang',
        name: '流浪动物领养',
        component: lingyang
      }
    ,{
        path: '/lingyangfankui',
        name: '领养反馈',
        component: lingyangfankui
      }
    ,{
        path: '/lingyangfankuiLiuyan',
        name: '领养反馈留言',
        component: lingyangfankuiLiuyan
      }
    ,{
        path: '/liulangdongwu',
        name: '流浪动物',
        component: liulangdongwu
      }
    ,{
        path: '/liulangdongwuLiuyan',
        name: '流浪动物留言',
        component: liulangdongwuLiuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/qiuzhu',
        name: '求助信息',
        component: qiuzhu
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yuangong',
        name: '员工',
        component: yuangong
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
