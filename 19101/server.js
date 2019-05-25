

const express = require('express')
const app = express()
const port = 3000

app.use('/19101', express.static('public'))

//app.use('/javascript', express.static('javascript'))


app.listen(port, () => console.log(`Example app listening on port ${port}!`))