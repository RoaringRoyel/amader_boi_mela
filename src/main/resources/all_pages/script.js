document.getElementById('dashboard').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>Welcome to the Admin Dashboard</h1>';
});

document.getElementById('add-user').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>Add New User</h1>';
});

document.getElementById('product-list').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>Product List</h1>';
});

document.getElementById('orders').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>Orders</h1>';
});

document.getElementById('add-products').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>Add New Product</h1>';
});

document.getElementById('manage-users').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>Manage Users</h1>';
});

document.getElementById('logout').addEventListener('click', function () {
    document.getElementById('content-area').innerHTML = '<h1>You have logged out!</h1>';
});
