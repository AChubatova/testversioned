package Tiger01335

import Tiger01335.buildTypes.*
import Tiger01335.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01335")
    name = "Tiger01335"

    vcsRoot(Tiger01335_cVCSroot)

    buildType(Tiger01335_Hi1)
    buildType(Tiger01335_Hi2)
    buildType(Tiger01335_Hi0)
    buildType(Tiger01335_Hi3)
})
