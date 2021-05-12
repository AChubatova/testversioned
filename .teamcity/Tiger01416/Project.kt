package Tiger01416

import Tiger01416.buildTypes.*
import Tiger01416.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01416")
    name = "Tiger01416"

    vcsRoot(Tiger01416_cVCSroot)

    buildType(Tiger01416_Hi0)
    buildType(Tiger01416_Hi2)
    buildType(Tiger01416_Hi1)
    buildType(Tiger01416_Hi3)
})
