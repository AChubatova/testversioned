package Tiger01923

import Tiger01923.buildTypes.*
import Tiger01923.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01923")
    name = "Tiger01923"

    vcsRoot(Tiger01923_cVCSroot)

    buildType(Tiger01923_Hi1)
    buildType(Tiger01923_Hi0)
    buildType(Tiger01923_Hi3)
    buildType(Tiger01923_Hi2)
})
