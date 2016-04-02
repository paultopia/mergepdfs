# mergepdf

Simple personal commandline utility to merge all pdfs in a directory. Only tested on OSX, built using lein-bin. Built because I often find myself with a directory full of PDFs (chapters of bigger writing project, anonymized student work that needs to be compiled and shared, etc.) that need to be merged and it's an annoying hassle to do it with big icky GUI apps or web services.

## Installation

Download the binary merge-pdfs either in the root directory here or from the releases page.  Stick it on your path. Make it executable. 

(or use one of the JAR files, or build it yourself, or whev.)

## Usage

    $ merge-pdfs outfile.pdf

will take every PDF in the directory you run it from and merge them into a file called output.pdf

it's basically alphabetical order, I think it goes in the order that directory listings show up in.

## Options

You get to specify the filename of the generated file. That's about it.

## License

All the code here is trivial, and some of it is straight cookbook code, so I'm not claiming any kind of copyright at all. Any bits that I could claim copyright in are hereby committed to the public domain. Ignore any cruft floating around in the files leiningen created to the contrary.