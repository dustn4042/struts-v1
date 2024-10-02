<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <title>New Document</title>
  <style type="text/css">
    input,
    textarea,
    select,
    button {
      background-color: #f2f2f2;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    .ff {
      background-color: #f2f2f2;
    }

    .fa {
      background-color: #f2f2f2;
    }
  </style>
</head>
<BODY>
  <form method="post" action="data.do">
    <table width="450" cellspacing="O" cellpadding="4" border="1" bordercolordark="#cc9900" bordercolorlight="#ffff66">
      <tr>
        <td width="25%" align="center" class="ff">
          <font size="2"><b>이름</b></font>
        </td>
        <td class=" fa">
          <input type="text" name="name">
        </td>
      </tr>
      <tr>
        <td align="center" class="ff">
          <font size="2"><b>ID</b></font>
        </td>
        <td class="fa"> <input type="text" name="id">
        </td>
      </tr>
      <tr>
        <td align="center" class="ff">
          <font size="2"><b>Password</b></font>
        </td>
        <td class="fa">
          <input type="password" name="pwd" maxlength="12" size="15">
        </td>
      </tr>
      <tr>
        <td width="25%" align="center" class="ff">&nbsp;</td>
        <td class="fa">
          <input type="submit" value="정보 보내기">
          <input type="reset" value="다시 입력">
        </td>
      </tr>
    </table>
  </form>
</BODY>
</html>