from flask import Flask, render_template
import random

app = Flask(__name__)

# list of Witcher images
images = [
    "https://media2.giphy.com/media/SGfWWpPV6LO92/200w.webp?cid=3640f6095bc2f2c32f4c6d6677822abe",
    "https://media1.giphy.com/media/QSACl5ZnSgQ5W/giphy.webp?cid=3640f6095bc2f2c32f4c6d6677822abe",
    "https://media3.giphy.com/media/6fsOq4QkRt7sQ/100.webp?cid=3640f6095bc2f2c32f4c6d6677822abe",
    "https://media3.giphy.com/media/TOUTZ7gKuUkEw/100.webp?cid=3640f6095bc2f2cf4a30637767977c28",
    "https://media2.giphy.com/media/w6vDzQDBicZd6/200w.webp?cid=3640f6095bc2f2c32f4c6d6677822abe",
    "https://media1.giphy.com/media/pAldTSASZNY6k/200w.webp?cid=3640f6095bc2f2c32f4c6d6677822abe",
    "https://media3.giphy.com/media/1zR9sZ5VfXUfSIbtd6/200w.webp?cid=3640f6095bc2f2c32f4c6d6677822abe"
]


@app.route('/')
def index():
    url = random.choice(images)
    return render_template('index.html', url=url)


if __name__ == "__main__":
    app.run(host="0.0.0.0")
