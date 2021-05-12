package Tiger053

import Tiger053.buildTypes.*
import Tiger053.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger053")
    name = "Tiger053"

    vcsRoot(Tiger053_cVCSroot)

    buildType(Tiger053_Hi1)
    buildType(Tiger053_Hi2)
    buildType(Tiger053_Hi3)
    buildType(Tiger053_Hi0)
})
