<%--
  Created by IntelliJ IDEA.
  User: zhaobin
  Date: 3/28/2016
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administrator page</h1>

            <p class="lead">This is the administrator page!</p>
        </div>

        <c:if test="${pageContext.request.userPrincipal.name !=null}">
            <h2>
                Wlcome:${pageContext.request.userPrincipal.name} | <a href="<c:url
                value="/j_spring_security_logout" />">Logout</a>
            </h2>
        </c:if>

        <h3>
            <a href="<c:url value="/admin/productInventory" />">Product Inventory</a>
        </h3>

        <p>Here you can view, check and modify the product</p>


        <%@include file="/WEB-INF/views/template/footer.jsp"%>
