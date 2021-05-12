package Tiger0188

import Tiger0188.buildTypes.*
import Tiger0188.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0188")
    name = "Tiger0188"

    vcsRoot(Tiger0188_cVCSroot)

    buildType(Tiger0188_Hi0)
    buildType(Tiger0188_Hi1)
    buildType(Tiger0188_Hi2)
    buildType(Tiger0188_Hi3)
})
