Front-End Developer Task
=================================

![Layout](https://bitbucket.org/canterpublic/front-end-dev-recruitment-task/raw/master/layout/frontend_layout.jpg)

## Requirements

1. Load page images/titles dynamically from JSON api: `GET /api/photos` e.g. `http://localhost:9000/api/photos`
2. FrontEnd form validation with html5 and/or javascript/jQuery

## Getting started
1. [Download](https://github.com/mnyamor/frontend-task.git)/Clone project structure to your favourite development environment (Windows/Linux/OSX)
2. Open project root directory in command prompt or terminal.
3. Launch development server with command: `activator run`
4. Now your development environment should be running on port 9000, it can be accessed on url: [http://localhost:9000](http://localhost:9000)
5. Refreshing page should load any changes made to project files.

[More information about Play Framework](https://www.playframework.com/documentation/2.3.x/Home)

### Html template(s)
Test project contains only one template.
`<project root>/app/views/main.scala.html`

### Resources (css/js/images etc..)

`<project root>/public/` is mapped to `http://localhost:9000/assets/`

e.g.

- `<project root>/public/stylesheets/css.css` -> `http://localhost:9000/assets/stylesheets/css.css`
- `<project root>/public/images/img1.jpg` -> `http://localhost:9000/assets/images/img1.jpg`


### Compiled assets (less/javascript)
also mapped to `http://localhost:9000/assets/..`

- `<project root>/app/assets/stylesheets/less.less` -> `http://localhost:9000/assets/stylesheets/less.css`
- `<project root>/app/assets/javascripts/photos.js` -> `http://localhost:9000/assets/javascripts/photos.js`


### Layout PSD file
[layout/frontend_layout.psd](https://bitbucket.org/canterpublic/front-end-dev-recruitment-task/raw/master/layout/frontend_layout.psd)

### OR JPG versions
[layout/frontend_layout.jpg](https://bitbucket.org/canterpublic/front-end-dev-recruitment-task/raw/master/layout/frontend_layout.jpg)

[layout/frontend_layout-grid.jpg](https://bitbucket.org/canterpublic/front-end-dev-recruitment-task/raw/master/layout/frontend_layout-grid.jpg)

### About the grid
- Bootstrap 3 grid template
- 1170px container
- 30px gutter
- 97-98px columns


## Supported browsers

- Firefox (latest version)
- Google Chrome (latest version)
- Internet Explorer 11
- Internet Explorer 8
