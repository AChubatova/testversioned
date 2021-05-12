package Tiger0537

import Tiger0537.buildTypes.*
import Tiger0537.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0537")
    name = "Tiger0537"

    vcsRoot(Tiger0537_cVCSroot)

    buildType(Tiger0537_Hi3)
    buildType(Tiger0537_Hi2)
    buildType(Tiger0537_Hi1)
    buildType(Tiger0537_Hi0)
})
