async function listBirds() {
  const res = await fetch('/api/v1/birds');
  const data = await res.json();
  const rows = data.map(b => `<tr><td>${b.id}</td><td>${b.tagId||''}</td><td>${b.breed||''}</td><td>${b.dob||''}</td></tr>`).join('');
  document.getElementById('birds').innerHTML = `<tr><th>ID</th><th>Tag</th><th>Breed</th><th>DOB</th></tr>${rows}`;
}
document.getElementById('refresh').onclick = listBirds;
document.getElementById('createBtn').onclick = async () => {
  const tag = document.getElementById('tag').value;
  const breed = document.getElementById('breed').value;
  const dob = document.getElementById('dob').value;
  const res = await fetch('/api/v1/birds', {
    method: 'POST', headers: {'Content-Type':'application/json'},
    body: JSON.stringify({tagId:tag, breed:breed, dob:dob})
  });
  if (res.ok) { document.getElementById('msg').textContent = 'Created'; listBirds(); }
  else { document.getElementById('msg').textContent = 'Error creating'; }
};
listBirds();
