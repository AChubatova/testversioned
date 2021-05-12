package Tiger0129

import Tiger0129.buildTypes.*
import Tiger0129.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0129")
    name = "Tiger0129"

    vcsRoot(Tiger0129_cVCSroot)

    buildType(Tiger0129_Hi2)
    buildType(Tiger0129_Hi1)
    buildType(Tiger0129_Hi3)
    buildType(Tiger0129_Hi0)
})
