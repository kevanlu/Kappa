Kappa
=====

Kappa is a Curvature Analysis Program developed in Java, aimed towards measuring the curvature in biological images. It allows a user to trace an initial shape with a B-Spline curve, and then fit that curve to image data with a minimization algorithm. Kappa was written with the Swing widget toolkit, and has been tested thoroughly on Windows, Mac OS X, and Linux.

Installation Instructions
-------------------------
You can download the latest version of Kappa from the following URL:
https://dl.dropboxusercontent.com/u/157117/Kappa%201.0.zip

To run Kappa, unzip the application folder and run the executable.

Getting Started
---------------
View our User Manual for detailed instructions on how to use Kappa.
https://dl.dropboxusercontent.com/u/157117/Kappa%20User%20Manual.pdf

Compiling the Source Code
-------------------------
### Importing the Project into Eclipse with eGit
eGit allows you to work with Git repositories within the Eclipse IDE.

1. Install eGit by following the instructions found here: http://www.eclipse.org/egit/
2. From the Eclipse Menubar, go to File -> Import
3. From the list of input sources, choose 'Projects from Git'
4. Choose 'URL' as the Repository Source
5. Fill out the fields as follows: 
	1. The host is 'github.com'
	2. The repository path is '/kevanlu/Kappa'
	3. The Protocol is git
6. Press next, choose the master branch, and choose the local destination for the project.

### Compiling Kappa without Eclipse

Changelog
---------
- **Version 1.00** : First release.

Referenced Libraries
--------------------
- **ij.jar** : ImageJ Libraries are used for file support and some image manipulation features.
- **jama-1.0.2.jar** : A Java Matrix library used for matrix operations.
