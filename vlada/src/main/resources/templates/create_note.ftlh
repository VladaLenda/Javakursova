<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Note</title>
</head>
<body>
<h1>Create Note</h1>
<form action="/notes/create" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required>
    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea>
    <button type="submit">Save</button>
</form>
</body>
</html>
