package Tiger01242

import Tiger01242.buildTypes.*
import Tiger01242.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01242")
    name = "Tiger01242"

    vcsRoot(Tiger01242_cVCSroot)

    buildType(Tiger01242_Hi3)
    buildType(Tiger01242_Hi2)
    buildType(Tiger01242_Hi1)
    buildType(Tiger01242_Hi0)
})
