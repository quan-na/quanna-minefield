A Simple SVG workflow:
---------------------------
 - Create a foo__(x|y|z).svg that contain circles and rectangles
 - A Python program will read that file, assign missing IDs, and project with random missing coordinate into foo__(x|y|z)_tpl.svg
 - You modify that template, save them as foo__(x|y|z).svg
 - When there 're 2 or more foo_(x|y|z).svg projection, the SVG is ready and can be projected into 3D view
