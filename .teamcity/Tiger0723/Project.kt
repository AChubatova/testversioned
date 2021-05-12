package Tiger0723

import Tiger0723.buildTypes.*
import Tiger0723.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0723")
    name = "Tiger0723"

    vcsRoot(Tiger0723_cVCSroot)

    buildType(Tiger0723_Hi3)
    buildType(Tiger0723_Hi1)
    buildType(Tiger0723_Hi2)
    buildType(Tiger0723_Hi0)
})
