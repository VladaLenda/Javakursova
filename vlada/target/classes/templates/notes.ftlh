<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Notes</title>
</head>
<body>
<h1>Notes</h1>
<a href="/notes/create">Create Note</a>
<ul>
    <#list notes as note>
        <li>
            <h2>${note.title}</h2>
            <p>${note.content}</p>
            <a href="/notes/edit/${note.id}">Edit</a>
            <a href="/notes/delete/${note.id}">Delete</a>
        </li>
    </#list>
</ul>
</body>
</html>
