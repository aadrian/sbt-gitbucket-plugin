package io.github.gitbucket.sbt

import sbt._

trait GitBucketPluginKeys {
  lazy val install = taskKey[Unit]("Install the plugin to a local GitBucket instance.")
}
