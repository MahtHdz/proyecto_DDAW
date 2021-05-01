function genProjects(){
    const projects = document.getElementById("projects-container");
    
    /* Project values */
    const projectList = ["Proyecto 1", "Proyecto 2", "Proyecto .."];
    const projectNames = ["A", "B", "C"];
    const description = `Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam aliquet ipsum vitae
                     interdum molestie.Mauris accumsan rhoncus purus at laoreet.Aenean non placerat
                     lacus.Nam porttitor, ante a placerat fermentum, odio libero congue arcu,
                     vitae semper elit eros vitae nulla.Sed commodo porta leo eget malesuada.
                     `;
    for (let i = 0; i < projectList.length; i++) {
        projects.innerHTML +=    `
                <div class="col-md-4">
                    <div class="panel panel-default fixed-width center-block" data-toggle="modal" data-target="#projectA">
                        <div class="panel-body">
                            <a href="project/project.html">
                                <img class="img-responsive center-block" src="http://placeimg.com/600/480/tech/1" />
                            </a>
                        </div>
                        <div class="panel-footer">
                            <a href="project/project.html">
                                <h3>Projecto ${i + 1}: ${projectNames[i]}</h3>
                            </a>
                            <p>${description}</p>
                        </div>
                    </div>
                </div>    
            `
    }
}

function main(){
    genProjects();
}

main();