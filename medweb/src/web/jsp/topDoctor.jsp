<%@ page session="false" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="emptyData" value="true"/>
<c:forEach var="d" items="${tDoclist}">
<c:set var="emptyData" value="false"/>
<div class="pg-contlist-2">
<h1>

<div style="height:0px;font-size:0px;"></div>

<a href="${d.url}" target="_blank" class="h1-a">${d.name}?ҽ��</a>
<span class="lev">
<span class="lev02">${d.grade}</span>/${d.area}
</span>
</h1>
<p>�س�:<span class="special">${d.traits}</span></p>
<p class="profile">${d.profile}</p>
<p>
<span style="display:none">
�������:
<a href="#">����</a>
<a href="#">����ʱ��</a>
<a href="#">��ͼ</a>
<a href="#">ԤԼ�Һ�</a>
<a href="#">��ѯ</a>
</span>
<span class="more" style="display:none"><a href="#" class="down">��ϸ����>></a><a href="#" class="up">�ջ�����<<</a></span>
</p>
</div>
</c:forEach>
<c:if test="${emptyData == 'true'}">
<br/>
��Ǹ! ��ʱû�������Ϣ��
<div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>
<div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>
</c:if>