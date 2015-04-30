==================
Friboo Hello World
==================

This project is a very simple example of using the `friboo`_ Clojure library to build microservices.

.. code-block:: bash

    $ lein uberjar
    $ docker build -t friboo-hello-world .
    $ docker run -it -p 8080:8080 friboo-hello-world

.. _friboo: https://github.com/zalando-stups/friboo
