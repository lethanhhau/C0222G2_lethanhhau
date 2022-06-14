<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/6/2022
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Furama Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
</head>
<body>

<div class="col-12 row  bg-warning" style="padding: 0px;margin: 0px">
    <div class="col-2" style="padding-left: 50px"><img
            src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="65px"></div>
    <div class="col-10">
        <div class="col-lg-12 row">
            <div class="col-lg-10 text-center" style="padding-top: 22px; color: #1c7430"><h2>Furama Management</h2>
            </div>
            <div class="col-lg-2">
                <p style="padding-top: 35px">LÊ THANH HẬU</p>
            </div>
        </div>
    </div>
</div>

<div class="col-12" style="padding: 0px;margin: 0px">
    <nav class="navbar navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="/index.jsp">Home</a>
            <a class="navbar-brand" href="/employee">Employee</a>
            <a class="navbar-brand" href="/customer">Customer</a>
            <a class="navbar-brand" href="/service">Service</a>
            <a class="navbar-brand" href="/contract">Contract</a>
            <form class="d-flex" style="padding-top: 15px">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" width="100px">
                <button class="btn btn-outline-success bg-dark" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>

<div class="col-12 row" style="padding: 0px;margin: 0px">
    <div class="col-3"  style="padding: 0px;margin: 0px">
        <div class="card" style="width: 18rem;">
            <img src="https://cdn.cet.edu.vn/wp-content/uploads/2018/02/thuat-ngu-resort-la-gi.jpg" class="card-img-top"
                 alt="..." height="150px">
            <div class="card-body">
                <h5 class="card-title">Furama</h5>
                <p class="card-text">Khu Nghỉ Dưỡng Furama</p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
        </div>
        <div class="card" style="width: 18rem; height: 100px">
            <img src="https://www.hoteljob.vn/uploads/images/18-08-08-16/Resort-la-gi-01.jpeg" class="card-img-top"
                 alt="..." height="150px">
            <div class="card-body">
                <h5 class="card-title">Furama</h5>
                <p class="card-text">Tiện nghi vươn tầm</p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
        </div>
    </div>

    <div class="col-9"  style="padding: 0px;margin: 0px">
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                        aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                        aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                        aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="https://cdn.cet.edu.vn/wp-content/uploads/2018/02/thuat-ngu-resort-la-gi.jpg"
                         class="d-block" width="100%" height="500px" alt="">
                    <div class="carousel-caption d-none d-md-block">
                        <h4>First slide label</h4>
                        <p>Some representative placeholder content for the first slide.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="https://www.phunu8.vn/PhuNu8DuLieu/PhuNu8HinhAnh/u4678/phu-nu-8-resort-dep-nhat-viet-nam-anh1.jpg"
                         class="d-block" width="100%" height="500px" alt="">
                    <div class="carousel-caption d-none d-md-block">
                        <h4>Second slide label</h4>
                        <p>Some representative placeholder content for the second slide.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="https://www.hoteljob.vn/uploads/images/18-08-08-16/Resort-la-gi-01.jpeg" class="d-block"
                         width="100%" height="500px" alt="">
                    <div class="carousel-caption d-none d-md-block">
                        <h4>Third slide label</h4>
                        <p>Some representative placeholder content for the third slide.</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                    data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                    data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
</div>
<footer class="container-fluid text-center bg-pink p-2 text-light">
    <p class="text-light">Furama Resort - &copy; Copyright by Hau 2022</p>
</footer>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>