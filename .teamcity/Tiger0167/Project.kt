package Tiger0167

import Tiger0167.buildTypes.*
import Tiger0167.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0167")
    name = "Tiger0167"

    vcsRoot(Tiger0167_cVCSroot)

    buildType(Tiger0167_Hi3)
    buildType(Tiger0167_Hi0)
    buildType(Tiger0167_Hi1)
    buildType(Tiger0167_Hi2)
})
