const base = {
    get() {
        return {
            url : "http://localhost:8080/liulangdongwujiuzu/",
            name: "liulangdongwujiuzu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/liulangdongwujiuzu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "流浪动物救助站"
        } 
    }
}
export default base
