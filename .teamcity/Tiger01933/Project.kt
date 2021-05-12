package Tiger01933

import Tiger01933.buildTypes.*
import Tiger01933.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01933")
    name = "Tiger01933"

    vcsRoot(Tiger01933_cVCSroot)

    buildType(Tiger01933_Hi3)
    buildType(Tiger01933_Hi2)
    buildType(Tiger01933_Hi1)
    buildType(Tiger01933_Hi0)
})
