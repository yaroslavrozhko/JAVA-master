document.addEventListener('DOMContentLoaded', function() {
    fetch('http://localhost:8080/api/masterclasses')
        .then(response => response.json())
        .then(data => {
            const masterclassesDiv = document.getElementById('masterclasses');
            data.forEach(masterclass => {
                const div = document.createElement('div');
                div.innerHTML = `<h2>${masterclass.title}</h2><p>${masterclass.description}</p>`;
                masterclassesDiv.appendChild(div);
            });
        });
});
