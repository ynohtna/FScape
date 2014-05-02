![logo](http://sciss.de/fscape/application.png)

# FScape

## statement

FScape is a standalone, cross-platform audio rendering software.

FScape is (C)opyright 2001&ndash;2013 by Hanns Holger Rutz. All rights reserved.

This program is free software; you can redistribute it and/or modify it under the terms of the [GNU General Public License](http://github.com/Sciss/FScape/blob/master/licenses/FScape-License.txt) as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but _without any warranty_ without even the implied warranty of _merchantability_ or _fitness for a particular purpose_. See the GNU General Public License for more details.

To contact the author, send an email to `contact at sciss.de`. For project status, API and current version visit [github.com/Sciss/FScape](http://github.com/Sciss/FScape).

## downloading

A binary version of FScape for Linux, OS X and Windows is provided through [Bintray](https://bintray.com/sciss/generic/FScape).

## running

In the binary distribution, you should just be able to double click the `FScape.jar` file, or `FScape.app` on OS X.

## compiling

FScape now builds with the [sbt](http://www.scala-sbt.org/) 0.12. You can use the provided `sbt` shell script if you do not want to install sbt on your system.

 - to compile: `sbt compile`
 - to package: `sbt package`
 - to run: `sbt run`
 - to make a standalone jar: `sbt assembly`
 - to make an OS X app bundle: `sbt appbundle`

## source code distribution

FScape's GPL'ed source code is made available throught [github.com/Sciss/FScape](http://github.com/Sciss/FScape).

For OSC communication, FScape uses the NetUtil library, which is licensed under the GNU Lesser General Public License (LGPL). The compiled library is included, for sourcecode and details visit [sourceforge.net/projects/netutil/](http://sourceforge.net/projects/netutil/).

FScape uses the ScissLib library which is licensed under the GNU General Public License, source code provided through [github.com/Sciss/ScissLib](https://github.com/Sciss/ScissLib), and Steve Roy's MRJAdapter published under the Artistic License, source code provided through [java.net/projects/mrjadapter/sources/svn/show](https://java.net/projects/mrjadapter/sources/svn/show).

## documentation

There's no real manual, but a basic online help hypertext starts from `help/index.html`. This help is also accessible from the help menu within the application.

A short screencast is available on [Vimeo](https://vimeo.com/26509124).