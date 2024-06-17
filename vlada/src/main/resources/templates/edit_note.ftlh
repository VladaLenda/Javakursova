<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Note</title>
</head>
<body>
<h1>Edit Note</h1>
<form action="/notes/edit/${note.id}" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" value="${note.title}" required>
    <label for="content">Content:</label>
    <textarea id="content" name="content" required>${note.content}</textarea>
    <button type="submit">Save</button>
</form>
</body>
</html>
