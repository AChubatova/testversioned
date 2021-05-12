package Tiger01726

import Tiger01726.buildTypes.*
import Tiger01726.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01726")
    name = "Tiger01726"

    vcsRoot(Tiger01726_cVCSroot)

    buildType(Tiger01726_Hi0)
    buildType(Tiger01726_Hi1)
    buildType(Tiger01726_Hi2)
    buildType(Tiger01726_Hi3)
})
