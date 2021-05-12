package Tiger01519

import Tiger01519.buildTypes.*
import Tiger01519.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01519")
    name = "Tiger01519"

    vcsRoot(Tiger01519_cVCSroot)

    buildType(Tiger01519_Hi3)
    buildType(Tiger01519_Hi0)
    buildType(Tiger01519_Hi2)
    buildType(Tiger01519_Hi1)
})
