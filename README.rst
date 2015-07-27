==================
Friboo Hello World
==================

This project is a very simple example of using the `friboo`_ Clojure library to build microservices.

.. code-block:: bash

    $ lein do uberjar, scm-source
    $ docker build -t friboo-hello-world .
    $ docker run -it -p 8080:8080 friboo-hello-world

Trying it out the `Swagger`_ defined API and validation:

.. code-block:: bash

    $ curl http://localhost:8080/hello/stranger     # will return HTTP code 200
    $ curl http://localhost:8080/hello/invalid.name # will return bad request with error message

The REST API schema is defined in the ``resources/api.yaml`` file.

.. _friboo: https://github.com/zalando-stups/friboo
.. _Swagger: http://swagger.io/
