<template>
<div id="wrapper">
	<header>
		<slot name="header" :title="header"></slot>
	</header>
	<aside id="sidebar">
		<slot name="sidebar" :title="sidebar"></slot>
	</aside>
	<section id="content">
          <router-view></router-view>
		<slot name="content" :title="content"></slot>
	</section> 
	<footer id="footer">
		<slot name="footer" :title="footer"></slot>
	</footer>
</div>
</template>
<script>
export default{
     data(){
          return {
               header: 'MONEYHUB', //여기는 위에 헤더 부분에 있는 :title="" 여기 안에 들어오는 거임!
               content: '여기는 컨텐츠',
               footer: '여기는 푸터',
          }
     }
}
</script>
<style scoped>
/* 전체 구조 */
#wrapper {
     padding: 5px;
     width: 960px;
     margin: 20px auto;
}
header {
     height: 100px;
     padding: 0 15px;
     /* background: steelblue; */
}
#content {
     width: 696px;
     float: left;
     padding: 5px 15px;
     min-height: 300px;
}
#sidebar {
     width: 200px;
     padding: 5px 15px;
     float: left;
}
footer {
     clear: both;
     padding: 0 15px;
     /* background: steelblue; */
}
/* 가로폭 980보다 작을 때 사용할 @media query */
@media screen and (max-width: 980px) {     
     #pagewrap {
           width: 94%;
     }
     #content {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     #sidebar {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     header, footer {
           padding: 1% 4%;
     }
}
/* 공통 */
#content {
     background: skyblue;
}
#sidebar {
     background: wheat;
     color: white;
}
header, #content, #middle, #sidebar {
     margin-bottom: 5px;
}
#pagewrap, header, #content, #middle, #sidebar, footer {
     border: solid 1px #ccc;
}
</style>