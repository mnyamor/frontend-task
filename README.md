Front-End Developer Recruitment Task
=================================

## Project brief
Convert the following web site design to HTML/CSS/JS.
![Layout](https://bitbucket.org/canterpublic/front-end-dev-recruitment-task/raw/master/layout/frontend_layout.jpg)

## Requirements

1. Modify front page to correspond the given layout (app/views/main.scala.html)
2. Use HTML5 / CSS3/Less
3. Design a prettier Sign-Up form validation. Error messages are provided by BackEnd (after invalid form submit).
4. Feel free to use open source frameworks/libraries. e.g. [Twitter Bootstrap](http://getbootstrap.com/2.3.2/index.html),
[jQuery](http://jquery.com/) (both already included in main.scala.html)

Bonus tasks:

1. Load page images/titles dynamically from JSON api: `GET /api/photos` e.g. `http://localhost:9000/api/photos`
2. FrontEnd form validation with html5 and/or javascript/jQuery


## Getting started
1. [Download](https://bitbucket.org/canterpublic/front-end-dev-recruitment-task/get/HEAD.zip)/Clone project structure to your favourite development environment (Windows/Linux/OSX)
2. Open project root directory in command prompt or terminal.
3. Launch development server with command: `activator run`
4. Now your development environment should be running on port 9000, it can be accessed on url: [http://localhost:9000](http://localhost:9000)
5. Refreshing page should load any changes made to project files.

[More information about Play Framework](https://www.playframework.com/documentation/2.3.x/Home)

### Html template(s)
Our test project contains only one template.
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
Ensure that the elements work and display correctly in the following browsers:

- Firefox (latest version)
- Google Chrome (latest version)
- Internet Explorer 11
- Internet Explorer 8


## Project Delivery
Create `firstName.lastName.zip` package containing modified project structure and send it as attachment to given email address.


## Quality Assurance

What you need to do to get high QA score? Simply get **Yes** for all these questions:

### General

- Are all requirements met?

### Precision

- Is reasonable pixel precision achieved?

### Browser check

- Does page display and work correctly in supported browsers?

### Valid HTML

- Is page valid?

### Semantic Markup

- Are the correct tags being used?

### Coding Standards

- Does page follow HTML standards?
- Does page follow CSS standards?
