load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name = "demo_lib",
    srcs = ["DemoClass.java"],
    deps = [
        "@batfish2//projects/batfish-common-protocol:common",
        "@batfish2//projects/bdd",
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_commons_commons_lang3",
    ],
)

java_binary(
    name = "demo",
    main_class = "DemoClass",
    runtime_deps = [":demo_lib"],
)
